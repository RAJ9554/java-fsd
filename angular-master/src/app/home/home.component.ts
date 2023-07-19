import { Component, OnInit } from '@angular/core';
import { AppService } from '../app.service';
import { Router, ActivatedRoute, ParamMap } from '@angular/router';
import profileData from '../data/profile.json';
import projectData from '../data/projects.json';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['../app.component.css']
})
export class HomeComponent implements OnInit {

  public profileData;
  public projectData;

  constructor(
    private appservice: AppService,
    private route: ActivatedRoute,
    private router: Router  
  ) {
    this.profileData = profileData;
    this.projectData = projectData;
  }

  ngOnInit() {
  }

  toggleProject(val) {
    if (val == 'webprojects') {
      this.appservice.setProjectData(projectData['webProject']);
    } else if (val == 'androidprojects') {
      this.appservice.setProjectData(projectData['androidProject']);
    } else if (val == 'softwareprojects') {
      this.appservice.setProjectData(projectData['softwareProject']);
    }

    this.router.navigate(['/projects', { category: val }]);
  }
}
