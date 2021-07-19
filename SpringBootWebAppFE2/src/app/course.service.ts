import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Course } from './course';
import { Student } from './student';

@Injectable({
  providedIn: 'root'
})
export class CourseService {
	
	private baseURL = "http://localhost:8080/api/v1/courses";

	constructor(private httpClient: HttpClient) { }

	getCourseList(): Observable<Course[]> {
		return this.httpClient.get<Course[]>(this.baseURL);
	}

	//getStudentList(): 
}