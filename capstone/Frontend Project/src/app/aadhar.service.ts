import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Aadhar } from './aadhar';

@Injectable({
  providedIn: 'root'
})
export class AadharService {
  baseUrl:string = "http://localhost:9091/aadhar"
  constructor(public http:HttpClient){}

  storeAadhar(aadhar:any):Observable<string>{
    return this.http.post(this.baseUrl+"/storeAadhar", aadhar ,{responseType:"text"});
  }

  updateAadhar(aadhar:any):Observable<string>{
    return this.http.patch(this.baseUrl+"/updateAadhar", aadhar,{responseType:"text"});
  }

  findAllAadhar():Observable<Aadhar[]>{
    return this.http.get<Aadhar[]>(this.baseUrl+"/findAllAadhar");
  }

  findAllAadharById(cid:number):Observable<string>{
    return this.http.get(this.baseUrl+"/findAllAadhar/"+cid,{responseType:"text"});
  }

  deleteAadharById(cid:number):Observable<string>{
    return this.http.delete(this.baseUrl+"/deleteAadhar/"+cid,{responseType:"text"});
  }
}
