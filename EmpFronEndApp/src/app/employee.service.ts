import { Injectable } from '@angular/core';
import { Employee } from './employee';
import { Observable } from 'rxjs';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  constructor(private httpClient:HttpClient) { }

  private ApiUrl = "http://localhost:9090/api/v1/employees";

GetAllEmployees() :Observable<Employee[]>
{
  return this.httpClient.get<Employee[]>(`${this.ApiUrl}`);
}

newEmployee(employee:Employee):Observable<Object>{
  return this.httpClient.post(`${this.ApiUrl}`, employee);
}

SearchEmp(id:number) : Observable<Employee>{
  return this.httpClient.get<Employee>(`${this.ApiUrl}/${id}`);
}

DeleteEmp(id:number) : Observable<Object>{
  return this.httpClient.delete(`${this.ApiUrl}/${id}`);
}

UpdateEmp(id:number, emp:Employee) : Observable<Object>{
  return this.httpClient.put(`${this.ApiUrl}/${id}`, emp);
}

}