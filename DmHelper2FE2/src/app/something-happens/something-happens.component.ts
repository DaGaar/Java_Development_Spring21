import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-something-happens',
  templateUrl: './something-happens.component.html',
  styleUrls: ['./something-happens.component.css']
})
export class SomethingHappensComponent implements OnInit {

  hit = 'Glancing blow';
  crit = '';
  
  constructor() { }

  ngOnInit(): void {
  }

}
