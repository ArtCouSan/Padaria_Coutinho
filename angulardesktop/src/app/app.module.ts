import { ProdutoServiceService } from './produto/services/produto-service.service';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { CadastroProdutoComponent } from './produto/cadastro-produto/cadastro-produto.component';
import { CadastroFuncionarioComponent } from './funcionario/cadastro-funcionario/cadastro-funcionario.component';
import { ConsultarProdutoComponent } from './produto/consultar-produto/consultar-produto.component';
import { EstoqueComponent } from './estoque/estoque/estoque.component';
import { ConsultarFuncionarioComponent } from './funcionario/consultar-funcionario/consultar-funcionario.component';
import { VendaComponent } from './venda/venda/venda.component';
import { RelatorioProdutoComponent } from './produto/relatorio/relatorio.component';
import { RelatorioComponent } from './venda/relatorio/relatorio.component';
import { HttpModule } from '@angular/http';

// ng g c componente

@NgModule({
  declarations: [
    AppComponent,
    CadastroProdutoComponent,
    CadastroFuncionarioComponent,
    ConsultarProdutoComponent,
    EstoqueComponent,
    ConsultarFuncionarioComponent,
    VendaComponent,
    RelatorioProdutoComponent,
    RelatorioComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpModule
  ],
  providers: [ProdutoServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
