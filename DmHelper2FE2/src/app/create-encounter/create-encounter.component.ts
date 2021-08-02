import { Component, OnInit } from '@angular/core';
import { Character } from '../character';
import { Combatant } from '../combatant';
import { CharacterService } from '../character-service';
import { CombatantService } from '../combatantservice';
import { Router } from '@angular/router';
import { ActivatedRoute } from '@angular/router';
import {ThemePalette} from '@angular/material/core';


export interface ChipColor {
  name: string;
  color: ThemePalette;
}



@Component({
  selector: 'app-create-encounter',
  templateUrl: './create-encounter.component.html',
  styleUrls: ['./create-encounter.component.css']
})
export class CreateEncounterComponent implements OnInit {

  availableColors: ChipColor[] = [
    {name: 'none', color: undefined},
    {name: 'Primary', color: 'primary'},
    {name: 'Accent', color: 'accent'},
    {name: 'Warn', color: 'warn'}
  ];

  id?: number;
  character?: Character;
  allCharacters?: Character[];
  allCombatants?: Combatant[];
  allies?: Character[];
  enemies?: Character[];

  constructor(private characterService: CharacterService, 
    private combatantService: CombatantService, private router: Router) {
      this.character = new Character();
     }

  ngOnInit(): void {
    this.getAllCharacters();
        this.getAllCombatants();

    // this.id = this.route.snapshot.params['id'];
    // this.character = new Character();
    // this.characterService.getCharacterById(this.id).subscribe( data => {
    //   this.character = data;
    // });
  }

  //TODO: MAKE VIEW UPDATE CHARACTER LIST (mat-chip)
  loadAlly(character: Character) {
    this.allies?.push(character);
    console.log(character);
    //this.goToCharacterList();
    // this.combatantService.createCombatant(this.combatant).subscribe( data => {
    //   console.log(data);
     // this.goToCharacterList();
    // },
    // error => console.log(error));
    
  }

  onSubmit() {
    this.goToCharacterList();
  }

   goToCharacterList() {
    this.router.navigate(['/characters']);
  }

  
  createCharacter() {
    this.router.navigate(['create-character']);
    //    this.id = this.route.snapshot.params['id'];
    // this.character = new Character();
    // this.characterService.getCharacterById(this.id).subscribe( data => {
    //   this.character = data;
    // });
  }

  private getAllCharacters() {
    this.characterService.getCharacterList().subscribe(data => {
      this.allCharacters = data;
    });
  }

    private getAllCombatants() {
    this.combatantService.getCombatantList().subscribe(data => {
      this.allCombatants = data;
    });
  }
}
