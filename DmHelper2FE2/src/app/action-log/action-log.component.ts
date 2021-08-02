import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Action } from '../action';
import { ActionService } from '../action.service';
import { Character } from '../character';
import { CharacterService } from '../character-service';

@Component({
  selector: 'app-action-log',
  templateUrl: './action-log.component.html',
  styleUrls: ['./action-log.component.css'],
  providers: [ ActionService]
})
export class ActionLogComponent implements OnInit {

  actions?: Action[];
  characters?: Character[];

  constructor(private actionService: ActionService, private characterService: 
    CharacterService, private router: Router) { }

  ngOnInit(): void {
    this.getActions();
    this.getCharacters();
  }

  private getActions() {
    this.actionService.getActionList().subscribe(data => {
      this.actions = data;
    })
  }

   private getCharacters() {
    this.characterService.getCharacterList().subscribe(data => {
      this.characters = data;
    });
  }

  //TODO: FIND WAY TO DISPLAY CHARACTER NAME ALONGSIDE ID IN LOG
  // private getCharName(id?: number) {
  //   this.characterService.getCharacterById(id)
  // }

  // viewAction(id?: number) {
  //   this.router.navigate(['ac'])
  // }

}
