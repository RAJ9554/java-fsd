import { Component, OnInit } from '@angular/core';
import { AppService } from '../app.service';
import projectData from '../data/projects.json';

@Component({
  selector: 'app-projects',
  templateUrl: './projects.component.html',
  styleUrls: ['./projects.component.css']
})
export class ProjectsComponent implements OnInit {

  public projectData;

  constructor(
    private appservice: AppService
  ) {
  }

  ngOnInit() {
    this.projectData = this.appservice.getProjectData();
    console.log(this.projectData);
  }

}
