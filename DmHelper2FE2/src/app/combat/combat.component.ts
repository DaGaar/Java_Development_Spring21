import { Component, OnInit } from '@angular/core';
import { Action } from '../action';
import { ActionService } from '../action.service';
import { Character } from '../character';
import { CharacterService } from '../character-service';
import { Router } from '@angular/router';
import {MatMenuModule} from '@angular/material/menu';

@Component({
  selector: 'app-combat',
  templateUrl: './combat.component.html',
  styleUrls: ['./combat.component.css']
})
export class CombatComponent implements OnInit {
  

  characters?: Character[];
  action: Action = new Action();

  constructor(private actionService: ActionService, private characterService: 
    CharacterService, private router: Router) { }

  ngOnInit(): void {
    this.getCharacters();
  }

    private getCharacters() {
    this.characterService.getCharacterList().subscribe(data => {
      this.characters = data;
    });
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
