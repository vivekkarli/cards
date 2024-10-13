package com.idealbank.cards.service;

import com.idealbank.cards.dto.CardsDto;

public interface ICardsService {
    /**
     *
     * @param mobileNumber - Mobile Number of the Customer
     */
    void createCard(String mobileNumber);

    CardsDto fetchCard(String mobileNumber);


    boolean updateCard(CardsDto cardsDto);


    boolean deleteCard(String mobileNumber);

}
