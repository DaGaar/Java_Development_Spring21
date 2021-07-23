import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Scholarship } from './scholarship';

@Injectable({
  providedIn: 'root'
})
export class ScholarshipService {

  private baseURL = "http://localhost:8080/api/v1/scholarships"

  constructor(private httpClient: HttpClient) { }

  getScholarshipList(): Observable<Scholarship[]> {
    return this.httpClient.get<Scholarship[]>(this.baseURL);
  }

  getScholarshipById(id?: number): Observable<Scholarship>{
    return this.httpClient.get<Scholarship>(`${this.baseURL}/${id}`);
  }

  viewScholarship(id?: number, scholarship?: Scholarship): Observable<Object>{
    return this.httpClient.get<Scholarship>(`${this.baseURL}/${id}`);
  }
}
