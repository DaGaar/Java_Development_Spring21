import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Character } from '../character';
import { CharacterService } from '../character-service';
import { Action } from '../action';
import { ActionService } from '../action.service';


@Component({
  selector: 'app-character-stats',
  templateUrl: './character-stats.component.html',
  styleUrls: ['./character-stats.component.css']
})
export class CharacterStatsComponent implements OnInit {

  id?: number;
  character?: Character;

  constructor(private characterService: CharacterService, private actionService: 
      ActionService, private route: ActivatedRoute) { }

  ngOnInit(): void {
    this.id = this.route.snapshot.params['id'];
    this.character = new Character();
    this.characterService.getCharacterById(this.id).subscribe( data => {
      this.character = data;
    });
  }

}
