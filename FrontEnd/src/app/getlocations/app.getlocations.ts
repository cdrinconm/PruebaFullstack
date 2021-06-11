import { Component } from '@angular/core';

import { DataService } from '../data.service';
import { Location } from '../models/Location';
import { MatDialog } from '@angular/material/dialog';

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
  displayedColumns: string[] = ['id', 'name', 'area_m2', 'parentloc', 'eliminar'];
  columnsToDisplay: string[] = this.displayedColumns.slice();
  deletemessage: String = "";

  constructor(private dataService: DataService, public dialog: MatDialog) {
    this.dataService.getLocations().subscribe(data => {
      this.locations = data;
    });
  }

  openDialog() {
    this.dialog.open(DialogElementsExampleDialog2);
  }

  deleteLocation(id: number) {
    this.dataService.deleteLocation(id).subscribe(data => {
      this.deletemessage = data;
    });
    this.openDialog();
    this.dataService.getLocations().subscribe(data => {
      this.locations = data;
    });
  }
}

@Component({
  selector: 'dialog-elements-example-dialog',
  templateUrl: './dialog-elements-example-dialog2.html',
})
export class DialogElementsExampleDialog2 { }