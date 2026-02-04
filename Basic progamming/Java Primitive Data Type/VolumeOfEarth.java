class VolumeOfEarth {
    public static void main(String[] args) {
        double radiusKm = 6371;            
        double radiusMiles = radiusKm * 0.621371;

        double volumeKm = (4.0 / 3) * Math.PI * Math.pow(radiusKm, 3);
        double volumeMiles = (4.0 / 3) * Math.PI * Math.pow(radiusMiles, 3);

        System.out.println("Volume of Earth in km^3 = " + volumeKm);
        System.out.println("Volume of Earth in miles^3 = " + volumeMiles);
    }
}
