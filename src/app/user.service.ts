import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import{ UserDetails } from 'C:/JFSJD/Angular/NewProject/src/app/user-details';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  private baseUrl = 'http://localhost:8485/api/v1';
  private url = "http://localhost:8485/api/v1/allUsers";

  constructor(private http: HttpClient) { }

  getApi():Observable<any>{
    return this.http.get(this.url);
  }
  getUsersList() : Observable<UserDetails[]>{
    return this.http.get<UserDetails[]>(`${this.url}`);
  }
  // private url = "http://localhost:8384/index2";

  // constructor(private http: HttpClient) { }

  // getApi():Observable<any>{
  //   return this.http.get(this.url);
  // }
  // registerUser(user: any): Observable<any> {
  //   const url = `${this.baseUrl}/register`;
  //   return this.http.post(url, user);
  // }
  createEmployee(user: UserDetails): Observable<Object>{
    return this.http.post(`${this.baseUrl}/register`, user);
  }

  deleteUser(id: number): Observable<Object>{
    return this.http.delete(`${this.baseUrl}/register/${id}`);
  }
  // updateUser(user: UserDetails): Observable<Object> {
  //   return this.http.put(`${this.baseUrl}`, user);
  // }
  // updateUser(user: UserDetails): Observable<Object> {
  //   return this.http.put(`${this.baseUrl}/update-user`, user);
  // }
  // updateUser(user: { id: number; oldPassword: String }): Observable<Object> {
  //   return this.http.put(`${this.baseUrl}/update-user`, user);
  // }
  // updateUser(user: UserDetails): Observable<Object> {
  //   return this.http.put(`${this.baseUrl}/register/${user.id}`, user);
  // }
  // updateUser(updatedUser: Partial<UserDetails>): Observable<Object> {
  //   return this.http.put(`${this.baseUrl}/register/${updatedUser.id}`, updatedUser);
  // }
  updateUser(id: number, user: UserDetails): Observable<Object>{
    return this.http.put(`${this.baseUrl}/register/${id}`, user);
  }
  getUserById(id: number): Observable<UserDetails> {
    return this.http.get<UserDetails>(`${this.baseUrl}/register/${id}`);
  }
  
}

