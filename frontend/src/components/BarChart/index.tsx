import Chart from 'react-apexcharts';

function BarChart() {

    const options = {
        plotOptions: {
            bar: {
                horizontal: true,
            }
        },
    };
    //categoria e lebal do graficos
    const mockData = {
        labels: {
            categories: ['Anakin', 'Barry Allen', 'Kal-El', 'Logan', 'Padmé']
        },
        series: [
            {
                name: "% Sucesso",
                data: [43.6, 67.1, 67.7, 45.6, 71.1]                   
            }
        ]
    };

         {/* 
         agora temos q retornar toda estrutura jsx correspodente ao grafico de barra
         pos a instalação do apexcharts feita pelo yarn. A estrutura é um component 
         apexcharts
          */}
    return ( 
        //estamos incorporando options na definição jsx, fazendo o return do codigo acima
        //o options vai ser incorporado na definição jsx, o options é a const da função acima
        <Chart
            options={{...options, xaxis: mockData.labels}} //pega todos q ja tem no options
            series={mockData.series}
            type="bar" //tipo do grafico e bar, mesmo q barras
            height="240" //altura do grafico
            />
    );
}

export default BarChart;

 

{/*  */}