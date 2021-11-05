public class 중복제거 {
    public String solution(String input) {

        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < input.length(); j++) {
                input = input.replaceAll("[a]{2}", "");
                input = input.replaceAll("[b]{2}", "");
                input = input.replaceAll("[c]{2}", "");
                input = input.replaceAll("[d]{2}", "");
                input = input.replaceAll("[e]{2}", "");
                input = input.replaceAll("[f]{2}", "");
                input = input.replaceAll("[g]{2}", "");
                input = input.replaceAll("[h]{2}", "");
                input = input.replaceAll("[i]{2}", "");
                input = input.replaceAll("[j]{2}", "");
                input = input.replaceAll("[k]{2}", "");
                input = input.replaceAll("[l]{2}", "");
                input = input.replaceAll("[n]{2}", "");
                input = input.replaceAll("[m]{2}", "");
                input = input.replaceAll("[o]{2}", "");
                input = input.replaceAll("[p]{2}", "");
                input = input.replaceAll("[q]{2}", "");
                input = input.replaceAll("[r]{2}", "");
                input = input.replaceAll("[s]{2}", "");
                input = input.replaceAll("[t]{2}", "");
                input = input.replaceAll("[u]{2}", "");
                input = input.replaceAll("[v]{2}", "");
                input = input.replaceAll("[w]{2}", "");
                input = input.replaceAll("[x]{2}", "");
                input = input.replaceAll("[y]{2}", "");
                input = input.replaceAll("[z]{2}", "");
            }
        }
        return input;
    }
}
