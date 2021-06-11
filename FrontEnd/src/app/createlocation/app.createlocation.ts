import { Component } from '@angular/core';

import { DataService } from '../data.service';
import { MatDialog } from '@angular/material/dialog';

@Component({
  selector: 'create-location',
  templateUrl: './app.createlocation.html',
  styleUrls: ['./app.createlocation.css']
})
export class CreateLocation {

  LocationCreated = { "id": 0, "name": '', "area_m2": 0, "parentloc": 0 };

  constructor(public dataService: DataService, public dialog: MatDialog) { }

  openDialogCreate() {
    this.dialog.open(DialogElementsExampleDialog);
  }

  openDialogUpdate() {
    this.dialog.open(DialogElementsExampleDialog2);
  }

  createNewLocation(idLocation: HTMLInputElement, nameLocation: HTMLInputElement, areaLocation: HTMLInputElement, parentLocation: HTMLInputElement) {
    if (idLocation.value == '') {
      if (nameLocation.value != '' && areaLocation.value != '' && parentLocation.value != '') {
        this.dataService.createLocation(nameLocation.value, areaLocation.valueAsNumber, parentLocation.valueAsNumber).subscribe(data => {
          this.LocationCreated = data;
        });
        idLocation.value = '';
        nameLocation.value = '';
        areaLocation.value = '';
        parentLocation.value = '';
        this.openDialogCreate();
      } else {
        alert("Empty fields!");
      }
    }else{
      this.dataService.updateLocation(idLocation.valueAsNumber, nameLocation.value, areaLocation.valueAsNumber, parentLocation.valueAsNumber).subscribe(data => {
        this.LocationCreated = data;
      });
      idLocation.value = '';
      nameLocation.value = '';
      areaLocation.value = '';
      parentLocation.value = '';
      this.openDialogUpdate();
    }
    return false;
  }
}

@Component({
  selector: 'dialog-elements-example-dialog',
  templateUrl: './dialog-elements-example-dialog.html',
})
export class DialogElementsExampleDialog {}

@Component({
  selector: 'dialog-elements-example-dialog',
  templateUrl: './dialog-elements-example-dialog2.html',
})
export class DialogElementsExampleDialog2 {}
