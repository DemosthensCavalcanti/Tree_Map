## Tree Map de Vendas de Celulares no Brasil

Este projeto visualiza as vendas das principais marcas de celulares no Brasil utilizando um gráfico do tipo Tree Map. A ferramenta foi desenvolvida em Java usando a biblioteca Swing, sem dependências externas.

### Estrutura do Projeto

O projeto consiste em três classes principais:

1. **TreeMapPanel**: Responsável por desenhar o tree map.
2. **TreeMapInputPanel**: Responsável por coletar os dados de entrada do usuário.
3. **TreeMapDemo**: A classe principal que integra as outras duas e exibe a interface gráfica.

### Estrutura dos Arquivos

- `TreeMapPanel.java`: Contém a lógica para desenhar o tree map.
- `TreeMapInputPanel.java`: Contém os campos de entrada e o botão para gerar o tree map.
- `TreeMapDemo.java`: A classe principal que configura a interface e integra os outros componentes.

### Pré-requisitos

- Java Development Kit (JDK) 8 ou superior

### Compilação e Execução

#### Passos para Compilar:

1. Abra o terminal ou prompt de comando.
2. Navegue até o diretório onde os arquivos `.java` estão localizados.
3. Compile os arquivos com o seguinte comando:

   ```bash
   javac TreeMapPanel.java TreeMapInputPanel.java TreeMapDemo.java
   ```

#### Passos para Executar:

1. No mesmo diretório, execute a classe principal com o comando:

   ```bash
   java TreeMapDemo
   ```

### Uso

1. **Coleta de Dados:**
   - O usuário insere os valores de vendas para as marcas Samsung, Apple, Xiaomi, Motorola e Outros nos campos de texto fornecidos.

2. **Geração do Tree Map:**
   - Clique no botão "Gerar Tree Map" para visualizar o gráfico.
   - O gráfico será atualizado em tempo real com base nos dados inseridos.

### Contribuições

Contribuições são bem-vindas! Se você encontrar bugs ou tiver sugestões para melhorias, sinta-se à vontade para abrir uma issue ou enviar um pull request.

### Licença

Este projeto está licenciado sob a Licença MIT. Veja o arquivo `LICENSE` para mais detalhes.

Autor
Demosthens Cavalcanti
https://www.linkedin.com/in/demosthens-cavalcanti-4a0b9627b/ | demosthenscf@gmail.com
