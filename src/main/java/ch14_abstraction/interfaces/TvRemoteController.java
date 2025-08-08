package ch14_abstraction.interfaces;

public class TvRemoteController {
    // 필드 선언
    private PowerButton powerButton;        // 접근지정자 클래스명 객체명   -> 여태까지의 작성방법과 다릅니다.
    private ChannelDownButton channelDownButton;
    private ChannelUpBotton channelUpButton;

    public TvRemoteController(PowerButton powerButton,
                              ChannelDownButton channelDownButton,
                              ChannelUpBotton channelUpButton) {
        this.powerButton = powerButton;
        this.channelDownButton = channelDownButton;
        this.channelUpButton = channelUpButton;
    }

    // 이제 이상에서 선언한 필드(객체)의 메서드를 호출하는 방법
    public void onPressedPowerButton() {
        powerButton.onPressed();
    }

    public void onPressedChannelDownButton() {
        channelDownButton.onPressed();
    }

    public void onDownChannelDownButton() {
        channelDownButton.onDown();
    }

    // onPressedChannelUpButton() 메서드 / onUpChannelUpButton() 메서드를 구현하시고,
    // Main에서 실행하여
    // 실행 예
    // 채널을 한 칸 올립니다.
    // 채널을 계속 올립니다.
}