public class ValidarCorreoV2 {
    public static void main(String[] args) {
        String correo = "test@example.com@";

        if (esCorreoValido(correo)) {
            System.out.println("El correo electrónico es válido.");
        } else {
            System.out.println("El correo electrónico no es válido.");
        }
    }

    public static boolean esCorreoValido(String correo) {
        if (correo == null) {
            return false;
        }

        if (!correo.contains("@")) {
            return false;
        }

        String[] partes = correo.split("@");
        if (partes.length != 2) {
            return false;
        }

        String parteUsuario = partes[0];
        String parteDominio = partes[1];
        if (parteUsuario.isEmpty() || parteDominio.isEmpty()) {
            return false;
        }

        if (!parteDominio.contains(".")) {
            return false;
        }

        String[] partesDominio = parteDominio.split("\\.");
        if (partesDominio.length < 2) {
            return false;
        }

        String dominioSuperior = partesDominio[partesDominio.length - 1];
        if (dominioSuperior.length() <= 1) {
            return false;
        }

        return true;
    }
}
