import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Action } from '../action';
import { ActionService } from '../action.service';

@Component({
  selector: 'app-action-log',
  templateUrl: './action-log.component.html',
  styleUrls: ['./action-log.component.css']
})
export class ActionLogComponent implements OnInit {

  actions?: Action[];

  constructor(private actionService: ActionService, private router: Router) { }

  ngOnInit(): void {
    this.getActions();
  }

  private getActions() {
    this.actionService.getActionList().subscribe(data => {
      this.actions = data;
    })
  }

  // viewAction(id?: number) {
  //   this.router.navigate(['ac'])
  // }

}
