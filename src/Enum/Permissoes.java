package Enum;

public enum Permissoes {
    GARCOM("Garçom"),
    ADMIN("Admin");

    private final String permissao;
    
    Permissoes(String permissao) {
        this.permissao = permissao;
    }

    public String getPermissao() {
        return permissao;
    }
}
