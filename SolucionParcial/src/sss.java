public class sss {

    public class Usuario {
        private TipoUsuario tipoDeUsuario;

        public Usuario(TipoUsuario tipoDeUsuario) {
            this.tipoDeUsuario = tipoDeUsuario;
        }

        public String permisosLoogin(){
            return this.tipoDeUsuario.login();
        }

    }


}
