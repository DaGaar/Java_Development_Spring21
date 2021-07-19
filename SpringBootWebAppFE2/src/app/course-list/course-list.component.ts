import { Component, OnInit } from '@angular/core';
import { Course } from '../course';
import { CourseService } from '../course.service';
import { Router } from '@angular/router';
import { StudentService } from '../student.service';
import { Student } from '../student';


@Component({
  selector: 'app-course-list',
  templateUrl: './course-list.component.html',
  styleUrls: ['./course-list.component.css']
})
export class CourseListComponent implements OnInit {

  courses?: Course[];
  students?: Student[];

  constructor(private courseService: CourseService, private studentService:
    StudentService, private router: Router) {}

  ngOnInit(): void {
    this.getCourses();
    this.getStudents();
  }

  private getCourses() {
    this.courseService.getCourseList().subscribe(data => {
      this.courses = data;
      console.log("Course List", this.courses)
    });
  }

  private getStudents() {
    this.studentService.getStudentList().subscribe(data => {
      this.students = data;
    });
  }

   viewStudent(id?: number) {
    this.router.navigate(['student-detail', id]);
  }

}
