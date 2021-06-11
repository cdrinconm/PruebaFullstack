import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { Location } from './models/Location';

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

  updateLocation(id:number, name:string, area:number, parent:number){
    return this.http.post<Location>('/api/location', {"id":id, "name":name, "area_m2":area, "parentloc" : parent});
  }

  deleteLocation(id:number){
    return this.http.delete<String>('/api/location/' + id);
  }
}
