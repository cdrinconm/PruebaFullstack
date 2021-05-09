import { Component } from '@angular/core';

import { DataService } from '../data.service';
import { Location } from '../Location';

@Component({
  selector: 'get-locations',
  templateUrl: './app.getlocations.html',
  styleUrls: ['./app.getlocations.css']
})
export class GetLocations {

  name: string = "";
  area_m2: number = 0;
  parentloc: number = 0;
  locations: Location[] = [];
  displayedColumns: string[] = ['id', 'name', 'area_m2', 'parentloc'];
  columnsToDisplay: string[] = this.displayedColumns.slice();

  constructor(private dataService:DataService){
    this.dataService.getLocations().subscribe(data => {
      this.locations = data;
    });
  }
}
