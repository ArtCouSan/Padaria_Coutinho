import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RelatorioProdutoComponent } from './relatorio.component';

describe('RelatorioProdutoComponent', () => {
  let component: RelatorioProdutoComponent;
  let fixture: ComponentFixture<RelatorioProdutoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RelatorioProdutoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RelatorioProdutoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
