import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { observableToBeFn } from 'rxjs/internal/testing/TestScheduler';

@Injectable({
  providedIn: 'root'
})
export class LoginService {
  baseURL:string="http://localhost:9091/login";

  constructor(public http:HttpClient) { }

  signIn(login:any):Observable<String>{
    return this.http.post(this.baseURL+"/signIn",login,{responseType:"text"});
  }
  signUp(login:any):Observable<String>{
    return this.http.post(this.baseURL+"/signUp",login,{responseType:"text"});
  }
}
