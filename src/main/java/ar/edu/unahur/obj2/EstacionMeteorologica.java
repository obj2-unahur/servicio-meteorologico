package ar.edu.unahur.obj2;

public class EstacionMeteorologica {

    private final HumedadService humedadService;
    private final PresionService presionService;
    private final TemperaturaService temperaturaService;

    public EstacionMeteorologica(HumedadService humedadService, PresionService presionService, TemperaturaService temperaturaService) {
        this.humedadService = humedadService;
        this.presionService = presionService;
        this.temperaturaService = temperaturaService;
    }


}
