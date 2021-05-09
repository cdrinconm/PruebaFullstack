import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { Location } from './Location';

@Injectable({
  providedIn: 'root'
})
export class DataService {

  constructor(private http:HttpClient) { 
    console.log("Is Working!");
  }

  getLocations(){
    return this.http.get<Location[]>('/api/location');
  }

  createLocation(name:string, area:number, parent:number){
    return this.http.post<Location>('/api/location', {"name":name, "area_m2":area, "parentloc" : parent});
  }
}
