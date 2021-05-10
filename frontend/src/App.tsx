import BarChart from "components/BarChart";
import DataTable from "components/dataTable";
import DonoutChart from "components/DonoutChart";
import Footer from "components/footer";
import NavBar from "components/navBar";

// todo return desse arquivo será exibido no naegador(browse)
function App() {  
  return (
    <> 
    <NavBar />
    <div className="container">
      <h1 className="text-primary py-3">DashBoard de Vendas</h1>

      <div className="row px-3"> 
        <div className="col-sm-6">
          <h5 className="text-center text-secondary" >Taxa de Sucesso (%)</h5>
          <BarChart />
        </div>
        <div className="col-sm-6">
          <h5 className="text-center text-secondary">Participação nas Vendas</h5>
          <DonoutChart />
        </div>
      </div>

      <div className="py-4">
        <h2 className="text-primary"> Todas as Vendas</h2>
        
      </div>

      <DataTable />
    </div>
    <Footer />
    </>
  );
}

export default App;

/* 



function App() pode ser function ou constant
(fragments) todo os elementos de retorno ficara entre as duas tags
className="container"> container bootStrap para alinar infor da div
className="text-primary py-3">DashBoard de Vendas</h1> py-3 espaçamento na vertical 3
px-3"> class bootStrap vai organizar os components em uma linhalas, px-3 espaçamento na horizontal com 3 unidades
className="col-sm-6"> o layout do bootStrap usa 12col, ajustei para 6colunas className="col-sm-6"
*/