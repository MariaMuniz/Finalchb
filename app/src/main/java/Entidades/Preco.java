package Entidades;


    public class Preco implements EntidadePersistivel {

        private int id;
        private Double valor;
        private int idPlano;
        private int idOperadora;
        private int idProduto;
        private int idIdades;


        public Preco() {
        }

        public Preco(int id, Double valor, int idPlano, int idOperadora, int idProduto, int idIdades) {
            super();
            this.id = id;
            this.valor = valor;
            this.idPlano = idPlano;
            this.idOperadora = idOperadora;
            this.idProduto = idProduto;
            this.idIdades = idIdades;

        }

        public int getIdIdades() {
            return idIdades;
        }

        public void setIdIdades(int idIdades) {
            this.idIdades = idIdades;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Double getValor() {
            return valor;
        }

        public void setValor(Double valor) {
            this.valor = valor;
        }

        public int getIdPlano() {
            return idPlano;
        }

        public void setIdPlano(int idPlano) {
            this.idPlano = idPlano;
        }

        public int getIdOperadora() {
            return idOperadora;
        }

        public void setIdOperadora(int idOperadora) {
            this.idOperadora = idOperadora;
        }

        public int getIdProduto() {
            return idProduto;
        }

        public void setIdProduto(int idProduto) {
            this.idProduto = idProduto;
        }

        @Override
        public String toString() {
            return  " Id: "+id +" valor: " + valor +  " idPlano:" + idPlano + " idOperadora:" + idOperadora + " idProduto:" + idProduto + " idIdades "+idIdades;
        }


    }





