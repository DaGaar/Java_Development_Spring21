import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Scholarship } from '../scholarship';
import { ScholarshipService } from '../scholarship.service';
import { StudentService } from '../student.service';
import { Student } from '../student';

@Component({
  selector: 'app-scholarship-list',
  templateUrl: './scholarship-list.component.html',
  styleUrls: ['./scholarship-list.component.css']
})
export class ScholarshipListComponent implements OnInit {

  scholarships?: Scholarship[];
  students?: Student[];


  constructor(private scholarshipService: ScholarshipService, private studentService:
    StudentService, private router: Router) { }

  ngOnInit(): void {
    this.getScholarships();
    this.getStudents();

  }

  private getScholarships() {
    this.scholarshipService.getScholarshipList().subscribe(data => {
      this.scholarships = data;
    });
  }

   private getStudents() {
    this.studentService.getStudentList().subscribe(data => {
      this.students = data;
    });
  }

   viewScholarship(id?: number) {
    this.router.navigate(['scholarship-detail', id]);
  }
}
