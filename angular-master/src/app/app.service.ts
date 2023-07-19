import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AppService {
  public projectData;
  
  constructor() { }

  setProjectData(data) {
    this.projectData = data;
  }

  getProjectData() {
    return this.projectData;
  }
}
