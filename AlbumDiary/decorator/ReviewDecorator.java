package decorator;

import factory.Review;

public abstract class ReviewDecorator implements Review {
    protected Review review;

    public ReviewDecorator(Review review) {
        this.review = review;
    }
}