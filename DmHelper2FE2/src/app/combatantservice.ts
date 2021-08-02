import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Combatant } from './combatant';

@Injectable({
	providedIn: 'root'
})
export class CombatantService {
	
	private baseURL = "http://localhost:8080/api/v1/combatants";

	constructor(private httpClient: HttpClient) { }

	getCombatantList(): Observable<Combatant[]> {
		return this.httpClient.get<Combatant[]>(this.baseURL);
	}

	createCombatant(combatant: Combatant): Observable<Object> {
		return this.httpClient.post(`${this.baseURL}`, combatant);
	}

	getCombatantById(id?: number): Observable<Combatant>{
 		return this.httpClient.get<Combatant>(`${this.baseURL}/${id}`);
	}
	
}