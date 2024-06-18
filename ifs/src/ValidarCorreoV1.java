//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ValidarCorreoV1 {
    public static void main(String[] args) {
        String correo = "test@example.com";

        if (esCorreoValido(correo)) {
            System.out.println("El correo electrónico es válido.");
        } else {
            System.out.println("El correo electrónico no es válido.");
        }
    }

    public static boolean esCorreoValido(String correo) {
        if (correo != null) {
            if (correo.contains("@")) {
                String[] partes = correo.split("@");
                if (partes.length == 2) {
                    String parteLocal = partes[0];
                    String parteDominio = partes[1];
                    if (!parteLocal.isEmpty() && !parteDominio.isEmpty()) {
                        if (parteDominio.contains(".")) {
                            String[] partesDominio = parteDominio.split("\\.");
                            if (partesDominio.length >= 2) {
                                String dominioSuperior = partesDominio[partesDominio.length - 1];
                                if (!dominioSuperior.isEmpty() && dominioSuperior.length() > 1) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}