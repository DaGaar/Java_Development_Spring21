import { Component, OnInit } from '@angular/core';
import { Character } from '../character';
import { CharacterService } from '../character-service';
import { Router } from '@angular/router';
import { ActivatedRoute } from '@angular/router';


@Component({
  selector: 'app-create-encounter',
  templateUrl: './create-encounter.component.html',
  styleUrls: ['./create-encounter.component.css']
})
export class CreateEncounterComponent implements OnInit {

  id?: number;
  character?: Character;

  constructor(private characterService: CharacterService, 
    private router: Router) { }

  ngOnInit(): void {
    // this.id = this.route.snapshot.params['id'];
    // this.character = new Character();
    // this.characterService.getCharacterById(this.id).subscribe( data => {
    //   this.character = data;
    // });
  }

  private loadCharacter(id?: number) {
    this.characterService.getCharacterById().subscribe(data => {
      this.character = data;
    });
  }

  createCharacter() {
    this.router.navigate(['create-character']);
  }
}
