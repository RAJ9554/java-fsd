import { HttpClient, HttpErrorResponse, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { map, catchError } from 'rxjs/operators';
import { Observable, throwError } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CrudHttpService {
  apiUrl: string = 'http://localhost:3000/employees';
  headers = new HttpHeaders().set('Content-Type', 'application/json');

  constructor(private http: HttpClient) { }

  postEmployee(data: any): Observable<any> {
    return this.http.post<any>(this.apiUrl, data).pipe(
      map((res: any) => {
        return res;
      }),
      catchError(this.handleError)
    );
  }

  getEmployee(): Observable<any> {
    return this.http.get<any>(this.apiUrl).pipe(
      map((res: any) => {
        return res;
      }),
      catchError(this.handleError)
    );
  }

  updateEmployee(data: any, id: number): Observable<any> {
    return this.http.put<any>(`${this.apiUrl}/${id}`, data).pipe(
      map((res: any) => {
        return res;
      }),
      catchError(this.handleError)
    );
  }

  deleteEmployee(id: number): Observable<any> {
    return this.http.delete<any>(`${this.apiUrl}/${id}`).pipe(
      map((res: any) => {
        return res;
      }),
      catchError(this.handleError)
    );
  }

  // Handle API errors
  private handleError(error: HttpErrorResponse): Observable<never> {
    if (error.error instanceof ErrorEvent) {
      console.error('An error occurred:', error.error.message);
    } else {
      console.error(
        `Backend returned code ${error.status}, ` +
        `body was: ${error.error}`
      );
    }
    return throwError('Something bad happened; please try again later.');
  }
}
