package com.uberApp.strategies.impl;

import com.uberApp.entities.Driver;
import com.uberApp.entities.Payment;
import com.uberApp.entities.enums.PaymentStatus;
import com.uberApp.entities.enums.TransactionMethod;
import com.uberApp.repositories.PaymentRepository;
import com.uberApp.services.WalletService;
import com.uberApp.strategies.PaymentStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CashPaymentStrategy implements PaymentStrategy {

    private final WalletService walletService;
    private final PaymentRepository paymentRepository;

    @Override
    public void processPayment(Payment payment) {
        Driver driver = payment.getRide().getDriver();

        double platformCommission = payment.getAmount() * PLATFORM_COMMISSION;

        walletService.deductMoneyFromWallet(driver.getUser(), platformCommission, null,
                payment.getRide(), TransactionMethod.RIDE);

        payment.setPaymentStatus(PaymentStatus.CONFIRMED);
        paymentRepository.save(payment);
    }
}