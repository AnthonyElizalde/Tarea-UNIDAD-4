package DesarrolloU4;
public class TikTok {
    private String username;
    private int followers;
    private int likes;

    public TikTok(String username, int followers, int likes) {
        this.username = username;
        this.followers = followers;
        this.likes = likes;
    }

    public void postVideo(String videoTitle) {
        System.out.println(username + " publicó un nuevo video: " + videoTitle);
    }

    public void gainFollowers(int newFollowers) {
        this.followers += newFollowers;
        System.out.println(username + " ganó " + newFollowers + " nuevos seguidores. Total: " + followers);
    }

    @Override
    public String toString() {
        return "TikTok{" +
               "username='" + username + '\'' +
               ", followers=" + followers +
               ", likes=" + likes +
               '}';
    }
}



