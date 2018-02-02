import { FormsModule } from '@angular/forms';
import { RelatorioProdutoComponent } from './produto/relatorio/relatorio.component';
import { Component, ComponentFactory, ViewContainerRef, ViewChild, NgModule, ComponentFactoryResolver } from '@angular/core';
import { ConsultarProdutoComponent } from './produto/consultar-produto/consultar-produto.component';
import { CadastroProdutoComponent } from './produto/cadastro-produto/cadastro-produto.component';
import {BrowserModule} from '@angular/platform-browser';
import { CadastroFuncionarioComponent } from './funcionario/cadastro-funcionario/cadastro-funcionario.component';
import { EstoqueComponent } from './estoque/estoque/estoque.component';
import { ConsultarFuncionarioComponent } from './funcionario/consultar-funcionario/consultar-funcionario.component';
import { VendaComponent } from './venda/venda/venda.component';
import { RelatorioComponent } from './venda/relatorio/relatorio.component';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss'],
  entryComponents: [
    CadastroProdutoComponent,
    CadastroFuncionarioComponent,
    ConsultarProdutoComponent,
    EstoqueComponent,
    ConsultarFuncionarioComponent,
    VendaComponent,
    RelatorioComponent,
    RelatorioProdutoComponent
  ]
})
export class AppComponent {

  // Views
  @ViewChild('cadastroProduto', {read: ViewContainerRef}) cadastroProduto: ViewContainerRef;
  @ViewChild('cadastroFuncionario', {read: ViewContainerRef}) cadastroFuncionario: ViewContainerRef;
  @ViewChild('consultarProduto', {read: ViewContainerRef}) consultarProduto: ViewContainerRef;
  @ViewChild('estoque', {read: ViewContainerRef}) estoque: ViewContainerRef;
  @ViewChild('consultarFuncionario', {read: ViewContainerRef}) consultarFuncionario: ViewContainerRef;
  @ViewChild('venda', {read: ViewContainerRef}) venda: ViewContainerRef;
  @ViewChild('relatorioVenda', {read: ViewContainerRef}) relatorioVenda: ViewContainerRef;
  @ViewChild('relatorioProduto', {read: ViewContainerRef}) relatorioProduto: ViewContainerRef;

  constructor(
    private compFactoryResolver: ComponentFactoryResolver){
  }


  // Limpa componentes da tela
  clearComponents(){

    this.cadastroProduto.clear();

    this.cadastroFuncionario.clear();

    this.consultarProduto.clear();

    this.estoque.clear();

    this.consultarFuncionario.clear();

    this.venda.clear();

    this.relatorioVenda.clear();

    this.relatorioProduto.clear();
  }

  // Add componente cadastrar produto
  addComponent_AddProduto() {
    let compFactory: ComponentFactory<any>;
    compFactory = this.compFactoryResolver.resolveComponentFactory(CadastroProdutoComponent);
    this.clearComponents();
    this.cadastroProduto.createComponent(compFactory);
  }

  // Add componente cadastrar funcionario
  addComponent_AddFuncionario(){
    let compFactory: ComponentFactory<any>;
    compFactory = this.compFactoryResolver.resolveComponentFactory(CadastroFuncionarioComponent);
    this.clearComponents();
    this.cadastroFuncionario.createComponent(compFactory);
  }

  // Add componente consultar produto
  addComponent_SearchProduto(){

    let compFactory: ComponentFactory<any>;
    compFactory = this.compFactoryResolver.resolveComponentFactory(ConsultarProdutoComponent);
    this.clearComponents();
    this.consultarProduto.createComponent(compFactory);

  }

  // Add componente estoque
  addComponent_Estoque(){

    let compFactory: ComponentFactory<any>;
    compFactory = this.compFactoryResolver.resolveComponentFactory(EstoqueComponent);
    this.clearComponents();
    this.estoque.createComponent(compFactory);

  }

  // Add componente consultar funcionario
  addComponent_SearchFuncionario(){

    let compFactory: ComponentFactory<any>;
    compFactory = this.compFactoryResolver.resolveComponentFactory(ConsultarFuncionarioComponent);
    this.clearComponents();
    this.consultarFuncionario.createComponent(compFactory);

  }

  // Add componenente relatorio produtos
  addComponent_RelatorioProdutos(){

    let compFactory: ComponentFactory<any>;
    compFactory = this.compFactoryResolver.resolveComponentFactory(RelatorioProdutoComponent);
    this.clearComponents();
    this.relatorioProduto.createComponent(compFactory);

  }

  // Add componenente relatorio vendas
  addComponent_RelatorioVendas(){

    let compFactory: ComponentFactory<any>;
    compFactory = this.compFactoryResolver.resolveComponentFactory(RelatorioComponent);
    this.clearComponents();
    this.relatorioVenda.createComponent(compFactory);

  }


  // Add componente venda
  addComponent_Venda(){

    let compFactory: ComponentFactory<any>;
    compFactory = this.compFactoryResolver.resolveComponentFactory(VendaComponent);
    this.clearComponents();
    this.venda.createComponent(compFactory);

  }



}

