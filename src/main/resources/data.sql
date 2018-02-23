insert into supermercado.mercado(
    id,
    nome
)
values(
    1,
    'Extra'
);

insert into supermercado.mercado(
    id,
    nome
)
values(
    2,
    'Carrefour'
);

insert into supermercado.produto(
    id,
    nome,
    fabricante
)
values(
    1,
    'Shampoo',
    'P&G'
);

insert into supermercado.produto(
    id,
    nome,
    fabricante
)
values(
    2,
    'Condicionador',
    'P&G'
);

insert into supermercado.produto(
    id,
    nome,
    fabricante
)
values(
    3,
    'Gillete',
    'P&G'
);

--ADICIONA SHAMPOO NO EXTRA NO VALOR DE 15 REAIS
insert into supermercado.mercadoria(
    id,
    mercado_id,
    produto_id,
    valor
)
values(
    1,
    1,
    1,
    '15'

);

--ADICIONA CONDICIONADOR NO CARREFOUR NO VALOR DE 13 REAIS
insert into supermercado.mercadoria(
    id,
    mercado_id,
    produto_id,
    valor
)
values(
    2,
    2,
    2,
    '13'

);

--ADICIONA GILLETE NO CARREFOUR NO VALOR DE 2 REAIS
insert into supermercado.mercadoria(
    id,
    mercado_id,
    produto_id,
    valor
)
values(
    3,
    2,
    3,
    '2'

);

SELECT SETVAL('SUPERMERCADO.MERCADO_SEQUENCE', (SELECT MAX(ID) FROM SUPERMERCADO.MERCADO), TRUE);
SELECT SETVAL('SUPERMERCADO.PRODUTO_SEQUENCE', (SELECT MAX(ID) FROM SUPERMERCADO.PRODUTO), TRUE);
SELECT SETVAL('SUPERMERCADO.MERCADORIA_SEQUENCE', (SELECT MAX(ID) FROM SUPERMERCADO.MERCADORIA), TRUE);