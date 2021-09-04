package com.example.demo.entities;

import java.time.LocalDateTime;

@Entity
@Table(name = "currency_record")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CurrencyRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique=true, nullable=false)
    private Long id;

    @Column(name="from_currency_id")
    private Long fromCurrencyId;

    @Column(name="to_currency_id")
    private Long toCurrencyId;

    @Column(name="rate")
    private Double rate;

    @Column(name="timestamp")
    private LocalDateTime timestamp;
}
