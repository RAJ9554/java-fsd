import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminAadharViewComponent } from './admin-aadhar-view.component';

describe('AdminAadharViewComponent', () => {
  let component: AdminAadharViewComponent;
  let fixture: ComponentFixture<AdminAadharViewComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AdminAadharViewComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AdminAadharViewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
