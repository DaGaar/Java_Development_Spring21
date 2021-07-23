import { Component, OnInit } from '@angular/core';
import { Action } from '../action';
import { ActionService } from '../action.service';
import { Router } from '@angular/router';
import {MatMenuModule} from '@angular/material/menu';

@Component({
  selector: 'app-combat',
  templateUrl: './combat.component.html',
  styleUrls: ['./combat.component.css']
})
export class CombatComponent implements OnInit {
  

  action: Action = new Action();
  constructor(private actionService: ActionService, 
    private router: Router) { }

  ngOnInit(): void {
  }

  saveAction() {
    this.actionService.createAction(this.action).subscribe( data => {
      console.log(data);
      this.goToActionList();
    },
    error => console.log(error));
  }

  goToActionList() {
    this.router.navigate(['/actions']);
  }

  onSubmit() {
    this.saveAction();
    console.log(this.action);
  }

  

}
