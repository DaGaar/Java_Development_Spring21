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

  getId(event: Event): string {
    return (event.target as HTMLInputElement).value;
  }
  
  //TODO PERHAPS ASSIGN FIELDS TO PLACEHOLDER VARIABLES?
  //flush variables after creating action
  //flush if go back to previus variable creation (chenged mind or messed up)
  // a?: number = id
	// b?: number = encounterId
	// c?: number = attackerId
	// d?: number = attackedId
	// e?: number = dmgDone
	// f?: string = effect
	// g?: string = type

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
