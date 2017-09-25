public class BlogPost {
        String authorName;
        String title;
        String text;
        String publicationDate;

    public BlogPost(String authorName, String title, String text, String publicationDate) {
        this.authorName = authorName;
        this.title = title;
        this.text = text;
        this.publicationDate = publicationDate;
    }
    public static void main(String[] args) {
        BlogPost john = new BlogPost("John Doe", "Lorem Ipsum", "Lorem ipsum dolor sit amet.", "2000.05.04.");
        System.out.println(john.authorName + "," + john.title + "," + john.text + "," + john.publicationDate);
        BlogPost tim = new BlogPost("Tim Urban", "Wait but why", "A popular long-form, stick-figure-illustrated blog about almost everything.", "2010.10.10.");
        System.out.println(tim.authorName + "," + tim.title + "," + tim.text + "," + tim.publicationDate);
        BlogPost will = new BlogPost("William Turton", "One Engineer Is Trying to Get IBM to Reckon With Trump", "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.", "2017.03.28.");
        System.out.println(will.authorName + "," + will.title + "," + will.text + "," + will.publicationDate);
    }
}
