import { Component } from '@angular/core';

import { DataService } from '../data.service';
import { MatDialog } from '@angular/material/dialog';

@Component({
  selector: 'create-location',
  templateUrl: './app.createlocation.html',
  styleUrls: ['./app.createlocation.css']
})
export class CreateLocation {
  
  LocationCreated = { "id" : 0, "name":'', "area_m2":0, "parentloc" : 0};

  constructor(public dataService:DataService, public dialog: MatDialog){}

  openDialog() {
    this.dialog.open(DialogElementsExampleDialog);
  }
  
  createNewLocation(nameLocation:HTMLInputElement, areaLocation:HTMLInputElement, parentLocation:HTMLInputElement){
    if(nameLocation.value != '' && areaLocation.value != '' && parentLocation.value != ''){
      this.dataService.createLocation(nameLocation.value, areaLocation.valueAsNumber, parentLocation.valueAsNumber).subscribe(data => {
        this.LocationCreated = data;
      });
      nameLocation.value = '';
      areaLocation.value = '';
      parentLocation.value = '';
      this.openDialog();
    }else{
      alert("Empty fields!");
    }
    return false;
  }
}

@Component({
  selector: 'dialog-elements-example-dialog',
  templateUrl: './dialog-elements-example-dialog.html',
})
export class DialogElementsExampleDialog {}
