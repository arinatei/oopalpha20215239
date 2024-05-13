package hust.soict.globalict.aims.screen.manager;

public class MediaStore extends JPanel{
private Media media;
public MediaStore(Media media) {
    this.media = media;
    this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

    JLabel title = new JLabel(media.getTitle());
    title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 15)); // Set font size to 15
    title.setAlignmentX(CENTER_ALIGNMENT); // Center-align the label horizontally

    JLabel cost = new JLabel(String.valueOf(media.getCost()) + " $");
    cost.setAlignmentX(CENTER_ALIGNMENT); // Center-align the label horizontally

    JPanel container = new JPanel();
    container.setLayout(new FlowLayout(FlowLayout.CENTER));

    if (media instanceof Playable) {
        JButton playButton = new JButton("Play");
        container.add(playButton);
    }

    this.add(Box.createVerticalGlue()); // Add vertical glue for spacing
    this.add(title);
    this.add(cost);
    this.add(Box.createVerticalGlue()); // Add vertical glue for spacing
    this.add(container);

    this.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // Add a black border to the panel
}
}