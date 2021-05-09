import DataTable from "components/dataTable";
import Footer from "components/footer";
import NavBar from "components/navBar";

{/* todo return desse arquivo será exibido no naegador(browse) */}
function App() {  {/* pode ser function ou constant */}
  return (
    <> {/* (fragments) todo os elementos de retorno ficara entre as duas tags */}
    <NavBar />
    <div className="container">{/* container bootStrap para alinar infor da div  */}
      <h1 className="text-primary">Ola mundo!!!</h1>
      <DataTable />
    </div>
    <Footer />
    </>
  );
}

export default App;

{/*  */}