import { Component, OnInit } from '@angular/core';
import { Character } from '../character';
import { CharacterService } from '../character-service';
import { Action } from '../action';
import { ActionService } from '../action.service';
import { Router } from '@angular/router';


@Component({
  selector: 'app-character-list',
  templateUrl: './character-list.component.html',
  styleUrls: ['./character-list.component.css']
})
export class CharacterListComponent implements OnInit {

  characters?: Character[];
  character?: Character;
  stats?: [];

 // let charAttacks = getCharAttacks()

  constructor(private characterService: CharacterService, private actionService:
     ActionService, private router: Router) { }

  ngOnInit(): void {
    this.getCharacters();
    //this.getStats();
  }

  private getCharacters() {
    this.characterService.getCharacterList().subscribe(data => {
      this.characters = data;
    });
  }

  getStats(id?: number) {
    this.characterService.getCharAttacks(id);
  }


}
