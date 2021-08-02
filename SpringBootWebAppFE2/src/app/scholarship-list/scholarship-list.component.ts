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

  scholarships: Scholarship[];
  amountTotal: number;
  studentCount: number;



  constructor(private scholarshipService: ScholarshipService, private router: Router) { 

      this.scholarships= [];
      this.amountTotal = 0;
      this.studentCount = 0;
    }

  ngOnInit(): void {
    this.getScholarships();
    // this.getStudents();

  }

  private getScholarships() {
    this.scholarshipService.getScholarshipList().subscribe(data => {
      this.scholarships = data;
      this.sumAmounts();
      this.sumStudents();
      console.log("Scholarship List: ", this.scholarships);
    });
  }

   viewScholarship(id?: number) {
    this.router.navigate(['scholarship-detail', id]);
  }

  sumStudents() {
    for(let scholarship of this.scholarships) {
      for(let i=0; i < scholarship.students.length; i++) {
        this.studentCount++;
      }
    }
  }

  sumAmounts() {
    for(let scholarship of this.scholarships) {
      this.amountTotal += scholarship.amount;
    }
  }

} 
