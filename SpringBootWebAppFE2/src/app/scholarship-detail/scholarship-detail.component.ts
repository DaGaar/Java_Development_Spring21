import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Scholarship } from '../scholarship';
import { ScholarshipService } from '../scholarship.service';

@Component({
  selector: 'app-scholarship-detail',
  templateUrl: './scholarship-detail.component.html',
  styleUrls: ['./scholarship-detail.component.css']
})
export class ScholarshipDetailComponent implements OnInit {

  id?: number;
  scholarship?: Scholarship;

  constructor(private scholarShipService: ScholarshipService, 
    private route: ActivatedRoute) { }

  ngOnInit(): void {
    this.id = this.route.snapshot.params['id'];
    this.scholarship = new Scholarship();
    this.scholarShipService.getScholarshipById(this.id).subscribe( data => {
      this.scholarship = data;
    });
  }

}
